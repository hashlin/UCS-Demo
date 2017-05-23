package com.linminphyo.ucsdemo.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.linminphyo.ucsdemo.model.PhotoPOJO;
import com.linminphyo.ucsdemo.R;
import com.squareup.picasso.Picasso;

public class PhotoDetailsActivity extends AppCompatActivity {

  TextView tvName;
  ImageView ivPhoto;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_photo_details);

    if (getSupportActionBar() != null) {
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    tvName = (TextView) findViewById(R.id.tv_name);
    ivPhoto = (ImageView) findViewById(R.id.iv_photo);

    if (getIntent().getExtras().get("photoPOJO")!=null) {
      PhotoPOJO photo = (PhotoPOJO) getIntent().getExtras().get("photoPOJO");
      tvName.setText(photo.getUser().getName());
      Picasso.with(this).load(photo.getUrl().getRegular()).into(ivPhoto);
    }
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
      finish();
    }
    return true;
  }
}
