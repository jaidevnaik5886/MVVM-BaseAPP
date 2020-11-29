package com.example.mvvm.common

import androidx.lifecycle.LifecycleObserver


open class BasePresenter(private val view: BaseView) : LifecycleObserver {
//    private val disposeBag: CompositeDisposable
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_START)
//    fun onAttach() {
//    }
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
//    fun onDetach() {
//        disposeBag.clear()
//    }
//
//    fun <T> executeAsync(observable: Observable<T>, observer: BaseObserver<T>) {
//        executeAsync(observable, observer, false)
//    }
//
//    fun <T> executeAsyncWithProgress(observable: Observable<T>, observer: BaseObserver<T>) {
//        executeAsync(observable, observer, true)
//    }
//
//    private fun <T> executeAsync(observable: Observable<T>, observer: BaseObserver<T>, isProgressShow: Boolean) {
//        val fakeMapper = Function<T, T> { t -> t }
//        executeAsync(observable, observer, isProgressShow, fakeMapper)
//    }
//
//    private fun <T, R> executeAsync(observable: Observable<T>, observer: BaseObserver<R>, isProgressShow: Boolean, mapper: Function<in T, out R>) {
//        if (isProgressShow) {
//            view.runOnUi(Runnable {
//                view.showLoading()
//            })
//        }
//        observable
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnTerminate {
//                    if (isProgressShow) {
//                        view.hideLoading()
//                    }
//                }
//                .map(mapper)
//                .subscribe(observer)
//        disposeBag.add(observer)
//    }
//
//    val preferencesHelper: PreferencesHelper
//        get() = view.getPreferences()
//
//    val networkHelper: NetworkHelper
//        get() = view.getNetworkHelper()
//
//    init {
//        // Initialize this presenter as a lifecycle-aware when a view is a lifecycle owner.
//        if (view is LifecycleOwner) {
//            (view as LifecycleOwner).lifecycle.addObserver(this)
//        }
//        disposeBag = CompositeDisposable()
//    }
}