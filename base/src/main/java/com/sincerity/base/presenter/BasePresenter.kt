package com.sincerity.base.presenter

import com.sincerity.base.presenter.view.BaseView

open class BasePresenter<T : BaseView> {

    lateinit var mView: T

}