package com.github.tompower.ctlr

import com.github.tompower.ctlr.Direction.LEFT
import com.github.tompower.ctlr.Direction.RIGHT
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAware

class CloseRight : CloseTabAction(RIGHT)

class CloseLeft : CloseTabAction(LEFT)

open class CloseTabAction(
    private val direction: Direction
) : AnAction(), DumbAware {
    override fun actionPerformed(event: AnActionEvent) {
        CloseTabLeftRight(event, direction).closeFiles()
    }

    override fun update(event: AnActionEvent) {
        super.update(event)
        CloseTabLeftRight(event, direction).updatePresentationEnabled()
    }
}

enum class Direction {
    LEFT, RIGHT
}