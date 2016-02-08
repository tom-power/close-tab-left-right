package com.github.tompower.ctlr

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAware

class CloseRight : AnAction(), DumbAware {

    val direction = Direction.RIGHT

    override fun actionPerformed(event: AnActionEvent) {
        CloseTabLeftRight(event, direction).closeFiles()
    }

    override fun update(event: AnActionEvent ) {
        super.update(event);
        CloseTabLeftRight(event, direction).contextItemEnabled()
    }

}