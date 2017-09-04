package vip.frendy.demosnack

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import vip.frendy.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_list.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }

        button_example_1.setOnClickListener {
            val snackbar = Snackbar.make(relative_layout_main, "Hello from SnackBar 1", Snackbar.LENGTH_LONG)
            val snackbarView = snackbar.getView()
            snackbarView.setBackgroundColor(Color.parseColor("#4cef5350"))
            snackbar.show()
        }


        button_example_2.setOnClickListener {
            val snackbar = Snackbar
                    .make(relative_layout_main, "Had a snack at Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Undo", View.OnClickListener { Log.d("Action Button", "onClick triggered") })
            snackbar.setActionTextColor(Color.LTGRAY)
            snackbar.addIcon(R.mipmap.ic_core, 200)
            val snackbarView = snackbar.getView()
            snackbarView.setBackgroundColor(Color.parseColor("#555555"))
            (snackbarView.findViewById(R.id.snackbar_text) as TextView).setTextColor(Color.WHITE)
            snackbar.show()
        }


        button_example_3.setOnClickListener {
            val snackbar = Snackbar
                    .make(relative_layout_main, "Had a snack at Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Action", View.OnClickListener { Log.d("CLICKED Action", "CLIDKED Action") })
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.getView()
            snackbarView.setBackgroundColor(Color.parseColor("#0000CC"))
            (snackbarView.findViewById(R.id.snackbar_text) as TextView).setTextColor(Color.WHITE)
            snackbar.show()
        }


        button_example_4.setOnClickListener {
            val snackbar = Snackbar
                    .make(relative_layout_main, "Had a snack at Snackbar  Had a snack at Snackbar  Had a snack at Snackbar Had a snack at Snackbar Had a snack at Snackbar Had a snack at Snackbar", Snackbar.LENGTH_LONG)
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.getView()
            snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"))
            (snackbarView.findViewById(R.id.snackbar_text) as TextView).setTextColor(Color.YELLOW)
            snackbar.show()
        }

        button_example_5.setOnClickListener {
            val snackbar = Snackbar
                    .make(relative_layout_main, "Snacking with VectorDrawable", Snackbar.LENGTH_LONG)
            snackbar.setActionTextColor(Color.WHITE)
            snackbar.setIconLeft(R.drawable.ic_android_green_24dp, 24F)
            val snackbarView = snackbar.getView()
            snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"))
            (snackbarView.findViewById(R.id.snackbar_text) as TextView).setTextColor(Color.YELLOW)
            snackbar.show()
        }

        button_example_6.setOnClickListener {
            val snackbar = Snackbar
                    .make(relative_layout_main, "Snacking Left & Right", Snackbar.LENGTH_LONG)
            snackbar.setActionTextColor(Color.WHITE)
            snackbar.setIconLeft(R.mipmap.ic_core, 24F) //Size in dp - 24 is great!
            snackbar.setIconRight(R.drawable.ic_android_green_24dp, 48F) //Resize to bigger dp
            snackbar.setIconPadding(8)
            snackbar.setMaxWidth(3000)
            val snackbarView = snackbar.getView()
            snackbarView.setBackgroundColor(Color.parseColor("#CC00CC"))
            (snackbarView.findViewById(R.id.snackbar_text) as TextView).setTextColor(Color.YELLOW)
            snackbar.show()
        }
    }
}
