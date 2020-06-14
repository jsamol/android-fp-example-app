package io.github.jsamol.fp.util

import android.os.Bundle

fun bundle(initBlock: Bundle.() -> Unit): Bundle = Bundle().apply(initBlock)