package com.example.nisa.soundrecorder.util

import com.example.nisa.soundrecorder.player.RecordingRepository
import com.example.nisa.soundrecorder.player.RecordingViewModelProvider
import com.example.nisa.soundrecorder.recorder.RecorderRepository
import com.example.nisa.soundrecorder.recorder.RecorderViewModelProvider

object InjectorUtils {
    fun provideRecorderViewModelFactory(): RecorderViewModelProvider {
        val recorderRepository = RecorderRepository.getInstance()
        return RecorderViewModelProvider(recorderRepository)
    }

    fun provideRecordingViewModelFactory(): RecordingViewModelProvider {
        val recordingRepository = RecordingRepository.getInstance()
        return RecordingViewModelProvider(recordingRepository)
    }
}