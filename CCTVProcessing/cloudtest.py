import pyrebase
import time

config = {
    "apiKey": "<API Key>",
    "authDomain": "olho-515a1.firebaseapp.com",
    "databaseURL": "https://olho-515a1.firebaseio.com",
    "storageBucket": "olho-515a1.appspot.com"
}

firebase = pyrebase.initialize_app(config)

db = firebase.database()

for x in range(100):
    time.sleep(3)

    if(x % 2 != 0):
        db.child("SJT").child("Block1").update({"State": "Yes"})
    else:
        db.child("SJT").child("Block1").update({"State": "No"})

    print(x)
data = db.get()
