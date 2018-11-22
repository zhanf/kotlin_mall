package com.sincerity.base.presenter.view

import com.sincerity.base.presenter.BasePresenter

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun error() {
    }
}