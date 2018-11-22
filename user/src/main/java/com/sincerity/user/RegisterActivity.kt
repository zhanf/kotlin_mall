package com.sincerity.user

import android.os.Bundle
import com.sincerity.base.presenter.view.BaseMvpActivity
import com.sincerity.user.presenter.RegisterPresenter
import com.sincerity.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {

    override fun onRegisterResult(userName: String, password: String) {
        toast("click")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        mPresenter = RegisterPresenter()
        mPresenter.mView = this
        mTestTv.setOnClickListener{
            mPresenter.onRegister()
        }
    }
}
