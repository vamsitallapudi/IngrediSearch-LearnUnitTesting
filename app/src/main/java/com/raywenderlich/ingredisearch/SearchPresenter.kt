package com.raywenderlich.ingredisearch

class SearchPresenter {

//    presenter knows about view, so its holding reference to it.
    private var view: View? = null

//    once view is created, attach it to presenter
    fun attachView(view: View) {
        this.view = view
    }

//    once view is destroyed, detach it from presenter
    fun detachView(view: View) {
        this.view = null
    }

//    exposes search method.
    fun search(query: String) {
//    call the requiredMessage method implementation in case the query is blank, else, display results method
        if(query.isBlank()) {
            view?.showQueryRequiredMessage()
        } else {
            view?.showSearchResults(query)
        }
    }

    interface View {
        fun showQueryRequiredMessage()
        fun showSearchResults(query:String)
    }
}