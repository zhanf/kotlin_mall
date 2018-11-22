package com.sincerity.user.presenter.view

import com.sincerity.base.presenter.view.BaseView

interface RegisterView : BaseView {

    fun onRegisterResult(userName: String, password: String)
}