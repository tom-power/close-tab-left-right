package com.github.tompower.ctlr

import com.intellij.openapi.fileEditor.ex.FileEditorManagerEx
import com.intellij.openapi.vfs.VirtualFile

internal fun Files(
    editorManager: FileEditorManagerEx,
    direction: Direction
): List<VirtualFile> =
    if (!editorManager.hasOpenedFile()) {
        emptyList()
    } else {
        with(editorManager.currentWindow.files) {
            val currentFileIndex = indexOf(editorManager.currentFile)
            filter { indexOf(it) toThe direction of currentFileIndex }
        }
    }

internal infix fun Int.toThe(direction: Direction) = ToThe(this, direction)

internal class ToThe(
    private val index: Int,
    private val direction: Direction
) {
    infix fun of(other: Int): Boolean =
        when (direction) {
            Direction.LEFT -> index < other
            Direction.RIGHT -> index > other
        }
}