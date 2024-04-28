package com.example.travelapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var currentImage = 1
    private lateinit var image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val next = findViewById<ImageButton>(R.id.btnNext)
        val previous = findViewById<ImageButton>(R.id.btnPre)

        next.setOnClickListener{
            //perform next image operation
            val idCurrentImageString = "pic$currentImage"
            //get resources
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            //got the actual image.
            image =  findViewById(idCurrentImageInt)
            image.alpha=0f

            currentImage = (5+currentImage+1)%5
            val idImageToShowSting = "pic$currentImage"
            //get resources
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowSting,"id",packageName)
            //got the actual image.
            image =  findViewById(idImageToShowInt)
            image.alpha=1f

        }
        previous.setOnClickListener{
            //perform next image operation
            val idCurrentImageString = "pic$currentImage"
            //get resources
            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString,"id",packageName)
            //got the actual image.
            image =  findViewById(idCurrentImageInt)
            image.alpha=0f

            currentImage = (5+currentImage-1)%5
            val idImageToShowSting = "pic$currentImage"
            //get resources
            val idImageToShowInt = this.resources.getIdentifier(idImageToShowSting,"id",packageName)
            //got the actual image.
            image =  findViewById(idImageToShowInt)
            image.alpha=1f
        }

    }
}