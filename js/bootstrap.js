/*
 *  Panther is a program to encode your media files from one format to the other.
 *  Copyright (C) 2012  Sankha Narayan Guria
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *  This file defines the Javascript bindings in Panther.
 *  DO NOT MODIFY THIS FILE IF YOU DON'T KNOW WHAT YOU ARE DOING!
 */
importPackage(Packages.sngforge.panther.script);
importClass(java.io.File);

// javascript bindings for the MediaFile class
function MediaFile(file) {
	this.mf = new Packages.sngforge.panther.script.MediaFile(new java.io.File(file));
	
	this.getDuration = function() {
		return this.mf.getDuration();
	}
	
	this.getFormat = function() {
		return this.mf.getFormat();
	}
}

// javascript bindings for the PresetHandler class
function PresetHandler(file) {
	this.p = new Packages.sngforge.panther.script.PresetHandler(new java.io.File(file));
	
	this.getAudioBitrate = function() {
		return this.p.getAudioBitrate();
	}
	
	this.getAudioChannels = function() {
		return this.p.getAudioChannels();
	}
	
	this.getAudioCodec = function() {
		return this.p.getAudioCodec();
	}
	
	this.getAudioSamplingRate = function() {
		return this.p.getAudioSamplingRate();
	}
	
	this.getAudioVolume = function() {
		return this.p.getAudioVolume();
	}
	
	this.getDescription = function() {
		return this.p.getDescription();
	}
	
	this.getFormat = function() {
		return this.p.getFormat();
	}
	
	this.getVideoBitrate = function() {
		return this.p.getVideoBitrate();
	}
	
	this.getVideoCodec = function() {
		return this.p.getVideoCodec();
	}
	
	this.getDuration = function() {
		return this.p.getDuration();
	}
	
	this.getOffset = function() {
		return this.p.getOffset();
	}
	
	this.getVideoFramerate = function() {
		return this.p.getVideoFramerate();
	}
	
	this.getVideoHeight = function() {
		return this.p.getVideoHeight();
	}
	
	this.getVideoWidth = function() {
		return this.p.getVideoWidth();
	}
}

// javascript bindings for AudioEncoder class
function AudioEncoder(inFile, outFile) {
	this.ae = new Packages.sngforge.panther.script.AudioEncoder(new java.io.File(inFile), new java.io.File(outFile));
	
	this.encode = function() {
		this.ae.encode();
	}
	
	this.setBitrate = function(bitrate) {
		this.ae.setBitrate(bitrate);
	}
	
	this.setChannels = function(channels) {
		this.ae.setChannels(channels);
	}
	
	this.setDuration = function(duration) {
		this.ae.setDuration(duration);
	}
	
	this.setFormat = function(format) {
		this.ae.setFormat(format);
	}
	
	this.setOffset = function(offset) {
		this.ae.setOffset(offset);
	}
	
	this.setSamplingRate = function(sampling) {
		this.ae.setSamplingRate(sampling);
	}
	
	this.setVolume = function(volume) {
		this.ae.setVolume(volume);
	}
}

// javascript bindings for the FileJoiner class
function FileJoiner(outFile) {
	this.fj = new Packages.sngforge.panther.script.FileJoiner(new java.io.File(outFile));
	
	this.addFile = function(file) {
		this.fj.addFile(new java.io.File(file));
	}
	
	this.encode = function() {
		this.fj.encode();
	}
	
	this.removeFile = function(file) {
		this.fj.removeFile(new jva.io.File(file));
	}
}

// javascript bindings for the FileSplitter class
function FileSplitter(inFile, outDir) {
	this.fs = new Packages.sngforge.panther.script.FileSplitter(new java.io.File(inFile), new java.io.File(outDir));
	
	this.addTimePoint = function(sec) {
		this.fs.addTimePoint(sec);
	}
	
	this.encode = function() {
		this.fs.encode();
	}
	
	this.removeTimePoint = function(sec) {
		this.fs.removeTimePoint(sec);
	}
}

// javascript bindings for Reducer class
function Reducer(inFile, outDir) {
	this.r = new Packages.sngforge.panther.script.Reducer(new java.io.File(inFile), new java.io.File(outDir));
	
	this.encode = function(copyID3) {
		this.r.encode(copyID3);
	}
	
	this.getBitrate = function() {
		return this.r.getBitrate();
	}
	
	this.setBitrate = function(bitrate) {
		this.r.setBitrate(bitrate);
	}
}

// javascript bindings for Utilities class
function Utilities() {
	this.u = new Packages.sngforge.panther.script.Utilities();
	
	this.print = function(msg) {
		this.u.print(msg);
	}
	
	this.println = function(msg) {
		this.u.println(msg);
	}
}

// javascript bindings for VideoEncoder class
function VideoEncoder(inFile, outFile) {
	this.ve = new Packages.sngforge.panther.script.VideoEncoder(new java.io.File(inFile), new java.io.File(outFile));
	
	this.encode = function() {
		this.ve.encode();
	}
	
	this.setAudioBitrate = function(bitrate) {
		this.ve.setAudioBitrate(bitrate);
	}
	
	this.setAudioChannels = function(channels) {
		this.ve.setAudioChannels(channels);
	}
	
	this.setDuration = function(duration) {
		this.ve.setDuration(duration);
	}
	
	this.setFormat = function(format) {
		this.ve.setFormat(format);
	}
	
	this.setOffset = function(offset) {
		this.ve.setOffset(offset);
	}
	
	this.setAudioSamplingRate = function(sampling) {
		this.ve.setAudioSamplingRate(sampling);
	}
	
	this.setAudioVolume = function(volume) {
		this.ve.setAudioVolume(volume);
	}
	
	this.setFrameRate = function(framerate) {
		this.ve.setFrameRate(framerate);
	}
	
	this.setSize = function(width, height) {
		this.ve.setSize(width, height);
	}
	
	this.setvideoBitrate = function(bitrate) {
		this.ve.setVideoBitrate(bitrate);
	}
	
	this.setVideoCodec = function(codec) {
		this.ve.setViedoCodec(codec);
	}
}