/*
 *  Copyright (c) 2025 Hari Srinivasan <harisrini21@gmail.com>
 *
 *  This program is free software; you can redistribute it and/or modify it under
 *  the terms of the GNU General Public License as published by the Free Software
 *  Foundation; either version 3 of the License, or (at your option) any later
 *  version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with
 *  this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ichi2.anki.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.ichi2.anki.R

/**
 * Custom component that represents a resizable divider used in multi-pane layouts.
 * Encapsulates the resizing divider layout for better reusability.
 */
class ResizingDivider
    @JvmOverloads
    constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
    ) : FrameLayout(context, attrs, defStyleAttr) {
        private val dividerHandle: View

        init {
            // Inflate the original layout into this custom view
            LayoutInflater.from(context).inflate(R.layout.resizing_divider_internal, this, true)

            // Get reference to the divider handle
            dividerHandle = findViewById(R.id.divider_handle)

            // Set the default background color
            setBackgroundColor(context.getColor(R.color.idle_divider_color))
        }
    }
