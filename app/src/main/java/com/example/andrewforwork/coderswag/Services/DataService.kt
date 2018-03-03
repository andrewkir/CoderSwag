package com.example.andrewforwork.coderswag.Services

import com.example.andrewforwork.coderswag.Model.Category
import com.example.andrewforwork.coderswag.Model.Product

/**
 * Created by AndrewForWork on 03.03.2018.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$10","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$15","hat03"),
            Product("Devslopes SnapBack","$13","hat04")
    )
    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","$20","hoodie01"),
            Product("Devslopes Hoodie Red","$30","hoodie02"),
            Product("Devslopes Gray Hoodie","$42","hoodie03"),
            Product("Devslopes Black Hoodie","$25","hoodie04")
    )
    val shirts = listOf(
            Product("Devslopes Shirt Black","$10","shirt01"),
            Product("Devslopes Light Gray","$15","shirt02"),
            Product("Devslopes Hustle","$22","shirt03"),
            Product("KickFlip Studios","$18","shirt04")
    )
}