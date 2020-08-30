import yfinance as yf
import os
import sys
 


def main():

	print("Search for  SPY,AAPL,MSFT,AMZN,MU")


	x=str(input())

	tic = yf.Ticker(x)
	# tic = yf.Ticker('MSFT')
	print("History\n",tic.history(period="min"))
	print("\n")
	print("Recommendations\n",tic.recommendations)
	print("\n")
	print("Institutional holders\n",tic.institutional_holders)

main()

