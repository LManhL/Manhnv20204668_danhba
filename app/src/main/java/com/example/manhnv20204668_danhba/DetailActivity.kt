package com.example.manhnv20204668_danhba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class DetailActivity : AppCompatActivity() {

    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if(intent.hasExtra(UserListActivity.DETAIL_ACTIVITY_CODE)){
            user = intent.getParcelableExtra(UserListActivity.DETAIL_ACTIVITY_CODE)
        }

        findViewById<EditText>(R.id.edtEmailDetail).setText(user?.email ?: "")
        findViewById<EditText>(R.id.edtNameDetail).setText(user?.name ?: "")
        findViewById<EditText>(R.id.edtPhoneDetail).setText(user?.phone ?: "")

    }
}