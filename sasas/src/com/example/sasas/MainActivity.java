package com.example.sasas;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;




public class MainActivity extends Activity 
{
            float x1,x2;
            float y1, y2;
            @Override
            protected void onCreate(Bundle savedInstanceState) 
            {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main);
            }
           
            // onTouchEvent () method gets called when User performs any touch event on screen 
           // Method to handle touch event like left to right swap and right to left swap
                        public boolean onTouchEvent(MotionEvent touchevent) 
                        {
                                     switch (touchevent.getAction())
                                     {
                                            // when user first touches the screen we get x and y coordinate
                                             case MotionEvent.ACTION_DOWN: 
                                             {
                                                 x1 = touchevent.getX();
                                                 y1 = touchevent.getY();
                                                 break;
                                            }
                                             case MotionEvent.ACTION_UP: 
                                             {
                                                 x2 = touchevent.getX();
                                                 y2 = touchevent.getY(); 

                                                 //if left to right sweep event on screen
                                                 if (x1 < x2) 
                                                 {
                                                	 
                                                	 Intent op = new Intent(MainActivity.this,b.class);
                                     				startActivity(op);
                                                  }
                                                
                                                 // if right to left sweep event on screen
                                                 if (x1 > x2)
                                                 {
                                                     
                                                     Intent op = new Intent(MainActivity.this,c.class);
                                      				startActivity(op);
                                                 }
                                                
                                                 // if UP to Down sweep event on screen
                                                 if (y1 < y2) 
                                                 {
                                                     
                                                     Intent op = new Intent(MainActivity.this,d.class);
                                      				startActivity(op);
                                                 }
                                                
                                                 //if Down to UP sweep event on screen
                                                 if (y1 > y2)
                                                 {
                                                     
                                                     Intent op = new Intent(MainActivity.this,e.class);
                                      				startActivity(op);
                                                  }
                                                 break;
                                             }
                                     }
                                     return false;
                        }

   
}
