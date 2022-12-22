package com.sb.myfamily


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.sb.myfamily.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomNav.setOnItemSelectedListener {

            if (it.itemId == R.id.nav_guard) {

                inflateFrag(GuardFragment.newInstance())

            } else if (it.itemId == R.id.nav_home) {

                inflateFrag(HomeFragment.newInstance())

            }
            else if (it.itemId == R.id.nav_dashboard) {

                inflateFrag(DashboardFragment.newInstance())

            }else if (it.itemId == R.id.nav_profile) {

                inflateFrag(ProfileFragment.newInstance())

            }

            true
        }


    }


    private fun inflateFrag(newInstance: Fragment) {

        val transition = supportFragmentManager.beginTransaction()
        transition.replace(R.id.container, newInstance)
        transition.commit()


    }

}