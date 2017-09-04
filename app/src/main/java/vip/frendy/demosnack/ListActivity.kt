package vip.frendy.demosnack

import android.graphics.Color
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_list.*
import vip.frendy.demosnack.adapter.ListAdpater
import vip.frendy.snackbar.Snackbar

/**
 * Created by iiMedia on 2017/9/4.
 */
class ListActivity: AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener {

    private val MOCK_DATA = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        for(i in 0..20) MOCK_DATA.add("Test ${i}")

        swipe.setOnRefreshListener(this)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = ListAdpater(MOCK_DATA, {})
    }

    override fun onRefresh() {
        swipe.isRefreshing = false

        val snackbar = Snackbar.make(list, "成功为您推荐 ${MOCK_DATA.size} 条新内容 ", Snackbar.LENGTH_LONG)
        val snackbarView = snackbar.getView()
        snackbarView.setBackgroundColor(Color.parseColor("#4cef5350"))
        (snackbarView.findViewById(R.id.snackbar_text) as TextView).setTextColor(Color.WHITE)
        snackbar.show()
    }
}