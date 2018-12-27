package com.github.tompower.ctlr

import com.github.tompower.ctlr.Direction.LEFT
import com.github.tompower.ctlr.Direction.RIGHT
import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.vfs.VirtualFile

internal fun FileEditorManagerEx.files(direction: Direction): List<VirtualFile> =
    if (!hasOpenedFile()) {
        emptyList()
    } else {
        currentWindow.files.run {
            filter { indexOf(it) toThe direction of indexOf(currentFile) }
        }
    }

internal infix fun Int.toThe(direction: Direction) = ToThe(this, direction)

internal class ToThe(
    private val index: Int,
    private val direction: Direction
) {
    infix fun of(other: Int): Boolean =
        when (direction) {
            LEFT -> index < other
            RIGHT -> index > other
        }
}