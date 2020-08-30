import yfinance as yf
import os
import numpy as np
 


def main():

	# print("Search for  GOOG,SPY,AAPL,MSFT,AMZN,NFLX,BEST")


	
	y=['GOOG','SPY','AAPL','MSFT','AMZN','NFLX','BEST','AZRE']
	x=np.random.choice(y)
	
	tic = yf.Ticker(x)
	# tic = yf.Ticker('MSFT')
	print("\n",x.center(75),"\n")
	print("History\n".center(75),tic.history(period="max"))
	print("\n")
	print("Recommendations\n".center(75),tic.recommendations)
	print("\n")
	print("Institutional holders\n".center(75),tic.institutional_holders)

main()
