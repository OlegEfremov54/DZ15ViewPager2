package com.example.dz15viewpager2

import android.widget.ImageView
import java.io.Serializable

class OnBoardingFragmentViewModel(val title:String,val avtor:String, val imageView: Int):Serializable {
    companion object{
        val viewPagerList = mutableListOf(
            OnBoardingFragmentViewModel(
                "Ожидание",
                "Васильев К.",
                (R.drawable.ojidanie)
            ),
            OnBoardingFragmentViewModel(
                "Вождь",
                "Васильев К.",
                (R.drawable.vojd)
            ),
            OnBoardingFragmentViewModel(
                "Князь",
                "Васильев К.",
                (R.drawable.kniaz)
            )



        )
    }

}