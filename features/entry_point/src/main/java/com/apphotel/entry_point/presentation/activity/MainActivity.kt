package com.apphotel.entry_point.presentation.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.apphotel.arch.di.ViewModelFactory
import com.apphotel.core.BaseApp
import com.apphotel.core.di.qualifiers.MainFragmentContainer
import com.apphotel.entry_point.databinding.ActivityMainBinding
import com.apphotel.entry_point.di.MainActivityComponent
import com.apphotel.entry_point.presentation.viewmodel.MainActivityViewModel
import com.apphotel.utils.navigation.safelyAddFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @JvmField
    @field:[Inject MainFragmentContainer]
    var mainFragmentContainer: Int = 0

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels { viewModelFactory }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(newBase)
        MainActivityComponent.init((newBase.applicationContext as BaseApp).getApplicationProvider())
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.showMainScreen {
            beginTransaction(it)
        }
    }

    private fun beginTransaction(fragment: Fragment) {
        supportFragmentManager.safelyAddFragment(
            context = this,
            mainFragmentContainer,
            fragment,
            addToBackStack = false,
            clearBackStack = false
        )
    }
}
