package jp.bglb.bonboru.behaviors.app

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import butterknife.bindView

/**
* Copyright (C) 2017 Tetsuya Masuda
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
class MainActivity : AppCompatActivity() {

  val googleMap by bindView<Button>(R.id.google_map)
  val youtube by bindView<Button>(R.id.youtube)
  val navigation by bindView<Button>(R.id.bottom_navigation)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    googleMap.setOnClickListener {
      startActivity(Intent(this, GoogleMapBehaviorActivity::class.java))
    }

    youtube.setOnClickListener {
      startActivity(Intent(this, YoutubeBehaviorActivity::class.java))
    }

    navigation.setOnClickListener {
      startActivity(Intent(this, BottomNavigationActivity::class.java))
    }
  }
}
