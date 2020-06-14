package io.github.jsamol.fp.util.extension

import android.os.Bundle
import androidx.fragment.app.Fragment
import io.github.jsamol.fp.util.bundle

fun <T : Fragment> T.withArguments(argumentsBuilder: Bundle.() -> Unit): T =
    apply { arguments = bundle(argumentsBuilder) }