package com.java.designpattern.behavioral.iterator;

/**Channel is a simple POJO class that has attributes frequency and channel type.*/
public class Channel {

	private double frequency;
	private ChannelTypeEnum TYPE;

	public Channel(double frequency, ChannelTypeEnum type) {
		this.frequency = frequency;
		this.TYPE = type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", TYPE=" + TYPE + "]";
	}
}
