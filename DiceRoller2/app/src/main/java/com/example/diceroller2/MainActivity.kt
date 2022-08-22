package com.example.diceroller2

//import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class Dice(private val diceSides: Int) {
    fun roll(): Int {
        return (1..diceSides).random()
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.button)
        rollBtn.setOnClickListener {
            diceRoll()

            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()
        }
        diceRoll()
    }

    private fun diceRoll() {
        val dice = Dice(6)
        val dice1: ImageView = findViewById(R.id.imageView1)
        val dice2: ImageView = findViewById(R.id.imageView2)

        var diceNum: Int = dice.roll()
        val img1 = when(diceNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceNum = dice.roll()
        val img2 = when(diceNum) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice1.setImageResource(img1)
        dice2.setImageResource(img2)
    }
}
