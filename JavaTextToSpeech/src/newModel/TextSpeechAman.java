package newModel;

import marytts.modules.synthesis.Voice;

//Api url: https://github.com/goxr3plus/Java-Text-To-Speech-Tutorial
// http://mary.dfki.de/

public class TextSpeechAman {
	public static void main(String[] args) {
		
		Voice.getAvailableVoices().stream().forEach(System.out::println);
		
		
		TextToSpeech tts = new TextToSpeech();
		tts.setVoice("dfki-poppy-hsmm");
		tts.speak("Hi this is Aman. How are you?", 2f, false, false);
	}

}
