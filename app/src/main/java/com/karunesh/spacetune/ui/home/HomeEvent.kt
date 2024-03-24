package com.karunesh.spacetune.ui.home

import com.karunesh.spacetune.domain.model.Song

sealed class HomeEvent {
    object PlaySong : HomeEvent()
    object PauseSong : HomeEvent()
    object ResumeSong : HomeEvent()
    object FetchSong : HomeEvent()
    object SkipToNextSong : HomeEvent()
    object SkipToPreviousSong : HomeEvent()
    data class OnSongSelected(val selectedSong: Song) : HomeEvent()
}
