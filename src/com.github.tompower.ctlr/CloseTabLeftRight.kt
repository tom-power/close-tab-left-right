package com.github.tompower.ctlr

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAware


class CloseTabLeftRight {

    class CloseLeft : AnAction(), DumbAware {
        override fun actionPerformed(event: AnActionEvent) {

        }
    }

    class CloseRight : AnAction(), DumbAware {
        override fun actionPerformed(event: AnActionEvent) {

        }
    }
}