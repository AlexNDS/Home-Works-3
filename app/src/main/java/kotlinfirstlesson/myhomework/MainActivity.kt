package kotlinfirstlesson.myhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


           val helloTextView: TextView = findViewById(R.id.first_work_kotlin)
           helloTextView.textSize = 30f


        val randomizeButton: Button = findViewById(R.id.button_randomize)
      //  randomizeButton.setOnClickListener {

          //  randomize()

        randomizeButton.setOnClickListener {

            randomize()
        }

    }

    fun randomize() {

      val helloTextView: TextView = findViewById(R.id.first_work_kotlin)

             val randomValue = Random.nextInt(100)
                 helloTextView.text = randomValue.toString()
          if (randomValue >= 66) {
                  helloTextView.text = "YOU WIN"}
             else helloTextView.text = randomValue.toString()
    }


}


