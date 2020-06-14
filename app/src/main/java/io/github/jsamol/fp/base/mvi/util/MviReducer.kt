package io.github.jsamol.fp.base.mvi.util

import io.github.jsamol.fp.base.mvi.model.MviActionResult
import io.github.jsamol.fp.base.mvi.model.MviViewState

interface MviReducer<VS : MviViewState, AR : MviActionResult> {
    fun reduce(viewState: VS, actionResult: AR): VS
}