package com.sincerity.user.presenter

import com.sincerity.base.presenter.BasePresenter
import com.sincerity.user.presenter.view.RegisterView

class RegisterPresenter : BasePresenter<RegisterView>() {

    fun onRegister() {
        mView.onRegisterResult("", "")
    }
}