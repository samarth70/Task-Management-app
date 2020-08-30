import pyttsx3
import os
import speech_recognition as sr
import datetime
import smtplib
import wikipedia
import webbrowser
from tkinter import *
import threading 
import time

MASTER="Samarth"



# top.title("My Siri")
# top.minsize(300,300)


engine =pyttsx3.init('espeak')
voices=engine.getProperty('voices')
engine.setProperty('voices',voices[0].id)

#speak function will pronounece the string which is passed to it
def speak(text):
	engine.say(text)
	engine.runAndWait()

def wishme():
	hour=(datetime.datetime.now().hour)
	# print(hour)
	if hour >=0 and hour < 12:
		speak("Good Morning"+ MASTER)
	elif hour >=12 and hour <18:
		speak("Good afternoon"+ MASTER)
	else:
		speak("Good evening"+ MASTER)		#functn will greet

def takecommand():
	r=sr.Recognizer()
	with sr.Microphone() as source:
		# r.adjust_for_ambient_noise(source)
		print("listening")
		audio=r.listen(source,)

	try:
		print("Recognizing...")
		query= (r.recognize_google(audio,language="en-in")).lower()
		print(f"user said: {query}\n" )	

	except Exception as e:
		print("Say that again please")	
		query=None

	return query



def main():
	speak("Initializing  ...My Siri")
	wishme()
	
	# speak("How may i help you")	
	# query=takecommand()	
	
	while True:

		time.sleep(1)
		speak("How may i help you")	
		query=takecommand()

		if 'wikipedia' in query.lower():
			speak("Searching  Wikipedia..")
			query = query.replace("wikipedia","")
			results = wikipedia.summary(query,sentences=2)
			print(results)
			speak (results)
		
		elif 'open google' in query:
			url="https://www.google.co.in"
			mozilla_path="C:\\Program Files\\Mozilla Firefox\\firefox.exe"
			webbrowser.get('firefox').open_new_tab(url)
				
		elif 'open youtube' in query:
			url="https://www.youtube.com"
			mozilla_path="C:\\Program Files\\Mozilla Firefox\\firefox.exe"
			webbrowser.get('firefox').open_new_tab(url)

		elif 'open movies' or 'latest movies' in query:
			url2="https://www.imdb.com/chart/toptv/"		
			mozilla_path="C:\\Program Files\\Mozilla Firefox\\firefox.exe"
			webbrowser.get('firefox').open_new_tab(url2)

		elif 'play music' or 'open music' in query.lower():
			song=os.system('spotify') 
			# os.startfile(os.path.join(song,))

		elif 'settings' in query.lower():
			song=os.system('gnome-control-center') 


		elif  'time' in query:
			strtm=datetime.datetime.now().strftime("%H:%M:%S")
			speak(f"{MASTER} the time is {strtm}")

		elif 'stop' in query:
			speak(f"closing My siri")	
			exit()

		else :
			speak(f"Sorry,I am afraid ,I didn't understand")
			time.sleep(1)	
			# takecommand()



main()


