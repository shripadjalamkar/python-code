import pyttsx3


engine=pyttsx3.init('sapi5')
voices=engine.getProperty('voices')
print(voices[1].id)
engine.setproperty('voice',voices[0].id)


def speak1(audio):
    engine.say(audio)
    engine.runAndWait()

if _name_=="_main_":
    speak("i am shripad's artificial assistance")
