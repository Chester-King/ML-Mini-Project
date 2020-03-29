# YOLO Realtime parking status

### Problem Statement:

YOLO Realtime parking status- Detecting in real-time using CCTV footage if any car is in the parking spot or not and displaying the result in the android application in real-time.

### Problem description:

In the current world CCTV cameras record everything what happens in parking lots so that in an event of car theft the law enforcements and owner the of the car can track the thief down. The problem with existing method is it takes a lot of time. The use has to explicitly go through a long procedure to get the CCTV footage. Sometimes it is too late and the stolen vehicle is never retrieved. Our solution is to use real-time object tracking to show if the vehicle is in the parking spot or not. If scaled properly this project has the potential to actually be very useful as the android application shows live status by reading data from the server where live CCTV feed is processed in real-time

### Algorithm

#### CCTV Feed Working

A single neural network is applied to the full image. This network divides the image into regions and predicts bounding boxes and probabilities for each region. These bounding boxes are weighted by the predicted probabilities.
The processing of each image after running the YOLO algorithm returns coordinates of the bounding boxes of each detected object. It gives ordered pair (x,y) coordinate and then gives a (w,h) which is width and height of the bounding box. The object detection is limited to four wheelers by specifying the coco labels for this application.

#### Android app with the CCTV

The algorithm is set for detecting cars and trucks using the COCO-labels. Using Open CV dark blue rectangles are hardcoded at the parking spots. The scripts reads if the centroid of any of the bounding box of the cars and trucks detected enters the hard coded dark blue rectangle and then the scripts updates the cloud database with the value “Yes”. The android application reads the database updates from the cloud and update the value in all the android phones which have the app

### Implementation

You can get the implementation video [here](https://drive.google.com/open?id=14HmKPLL8RHc92QppbMS2oamxSrQz2Maz)

As you will be seeing in the video that as soon as the car disappears in the CCTV feed the android application data changes.

### Conclusion/inference

The above project focuses on detecting cars using the live feed using model trained on yolo model. The algorithm applies a neural network to an entire image. The network divides the image into an S x S grid and comes up with bounding boxes, which are boxes drawn around images and predicted probabilities for each of these regions. After the car is detected it is checked if the centroid of the bounding box of the car is at the parking spot or not using Open CV. If it is the database is updated which is picked up by the android application.
This system can be used for theft detection or smart parking system without any additional cost of hardware. Only the processing of the CCTV feed and a stable internet connection is needed.
