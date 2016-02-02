package com.github.tompower.ctlr

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAware


class CloseRight : AnAction(), DumbAware {
    override fun actionPerformed(event: AnActionEvent) {
        CloseTabLeftRight().exec(event, Direction(LeftRight.RIGHT))
    }
}