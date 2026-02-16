package dev.darkokoa.datetimewheelpicker.core

import androidx.compose.runtime.Immutable
import androidx.compose.ui.hapticfeedback.HapticFeedbackType

@Immutable
data class HapticTickConfig(
    val tickFeedback: HapticFeedbackType? = HapticFeedbackType.SegmentTick,
    val confirmationFeedback: HapticFeedbackType? = HapticFeedbackType.Confirm,
) {
    companion object {
        val None = HapticTickConfig(
            tickFeedback = null,
            confirmationFeedback = null,
        )
    }
}
