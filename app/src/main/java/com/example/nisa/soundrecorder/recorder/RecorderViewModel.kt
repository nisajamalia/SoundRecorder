package com.example.nisa.soundrecorder.recorder

import android.arch.lifecycle.ViewModel
import com.example.nisa.soundrecorder.util.RecorderState

class RecorderViewModel(val recorderRepository: RecorderRepository): ViewModel() {

    var recorderState: RecorderState = RecorderState.Stopped

    fun startRecording() = recorderRepository.startRecording()

    fun stopRecording() = recorderRepository.stopRecording()

    fun pauseRecording() = recorderRepository.pauseRecording()

    fun resumeRecording() = recorderRepository.resumeRecording()

    fun getRecordingTime() = recorderRepository.getRecordingTime()

}