package io.github.jsamol.fp.base.mvi.util

import io.github.jsamol.fp.base.mvi.model.MviAction
import io.github.jsamol.fp.base.mvi.model.MviActionResult
import kotlinx.coroutines.flow.Flow

interface MviDispatcher<A : MviAction, AR : MviActionResult> {
    fun dispatch(action: A): Flow<AR>
}