<!doctype html>
<html>
  <head>
<meta charset="utf-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <link rel="stylesheet" href="Bootstrap/css/bootstrap.min.css">
         <link rel="stylesheet" href="Logstu.css" type="text/css">
         <script src="Bootstrap/js/jquery-3.2.1.min.js" type="text/javascript"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
         <!--<script src="Bootstrap/js/bootstrap.min.js" type="text/javascript"></script>-->
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 
         <script>
     $(document).ready(function(){
     $("#flip").click(function(){
	 $("#flip").toggleClass("glyphicon-minus glyphicon-plus");
     $("#panel1").slideUp("slow");
     $("#panel2").slideUp("slow");
     $("#panel").slideToggle("slow");

    });
});
  
   $(document).ready(function(){
    $("#flip1").click(function(){
		 $("#flip1").toggleClass("glyphicon-minus glyphicon-plus");
		$("#panel").slideUp("slow");
        $("#panel2").slideUp("slow");
        $("#panel1").slideToggle("slow");
    });
});
   $(document).ready(function(){
    $("#flip2").click(function(){
		$("#flip2").toggleClass("glyphicon-minus glyphicon-plus");
		$("#panel").slideUp("slow");
        $("#panel1").slideUp("slow");
        $("#panel2").slideToggle("slow");
    });
});
     /* $(document).ready(function(){
	   $("#flip1").click(function(){
   if($("#flip").is(":hidden"))
{}
   else
     $("#flip").toggleClass("glyphicon-minus glyphicon-plus");
    });
});

        /* $(document).ready(function(){
	   $("#flip2").click(function(){
   if($("#flip").is(":hidden"))
{}
   else
     $("#flip").toggleClass("glyphicon-minus glyphicon-plus");
    });
});*/

         </script>
         <title>Student Information Form</title>
  </head>
       <body>
         <div class="container-fluid">
              <div class="row">
                 <div class="col-lg-12">
                    <div class="head">
                    <div class="col-lg-4">
     <img src="Images/images.jpg" class="img-responsive img-circle" style="height:85px; width:90px; margin-top:-15px;"/>
     </div>
                      <span style="text-shadow:3px 2px #C60; font-size:24px; margin-left:-350px;">Amrapali Institute of Technology and Sciences</span>
                       <a href="Home.html" style="margin-left:1220px; margin-top:20px; font-size:15px; color:#309; font-weight:bold;">Logout</a>                 
                        
                    </div>
                 </div>
              </div>
           </div>
          
           <div class="container-fluid">
              <div class="row">
                <div class="col-lg-2">
                    <div class="head1">
                       <a href="teach_log.html"><button>Home</button></a><br/>
                       <a href="teach_stu_log.html"><button>Register Student</button></a></br>
                        <div class="dropdown">
                            <button class="dropdown-toggle" data-toggle="dropdown">View Students<span class="caret"></span></button>
                            <ul class="dropdown-menu">
                                <li><a href="name_ret.html">Name</a></li>
                                <li><a href="session_ret.html">Session</a></li>
                                <li><a href="branch_ret.html">Branch</a></li>
                                <li><a href="roll_ret.html">Roll No.</a></li>
                                <li><a href="marks_ret.html">Marks</a></li>
                                
                            </ul>
                        </div>

                    </div>
                 </div>
                
                    
        <!-- Form -->            
         <div class="col-lg-7 col-md-7 col-sm-7 col-xs-7 head2">
          <span class="glyphicon glyphicon-plus-sign"><span style="font-size:26px;">REGISTER</span>
               <div class="col-lg-offset-4 col-lg-11 div1">
                     PERSONAL DETAILS <span style="float:right; color:#FFF;" class="glyphicon glyphicon-plus" id="flip"></span>
                    </div>
                    <div id="panel" class="col-lg-11" style="display:none;">
               <form method="post" action="upload" enctype="multipart/form-data" id="panel">
                 <div class="form-group row" style="margin-top:15px;" id="panel">
                   <div class="col-lg-4" id="panel">
                     <label>First Name </label>
                       <input type="text" placeholder="Pankaj" id="f" name="fname" class="form-control">
             </div>
                          <div class="col-lg-4" id="panel">
                          <label>Middle Name </label> 
                          <input type="text" placeholder="Kumar" id="m" name="mname" class="form-control">
                          </div>
                          <div class="col-lg-4" id="panel">
                          <label>Last Name </label>
                          <input type="text" placeholder="Kumar" id="l" name="lname" class="form-control">
                           </div>
                          <div class="col-lg-4" id="panel">
                          <label>Date of Birth</label>
                          <input type="date" placeholder="04-08-1995" id="d" name="dob" class="form-control">
                          </div>
                           <div class="col-lg-4" id="panel">
                           <label>Father's Name</label>
                          <input type="text" placeholder="Dinesh Sharma" id="f" name="father_name" class="form-control">
                          </div>
                           <div class="col-lg-4" id="panel">
                          <label>Father's Phone No.</label>
                          <input type="number" placeholder="9783277265" id="fp" name="fno" class="form-control">
                          </div>
                           <div class="col-lg-4" id="panel">
                          <label>Student Phone No.</label>
                          <input type="number" placeholder="9783277265" id="ph" name="sno" class="form-control">
                          </div>
                          
                           <div class="col-lg-4" id="panel">
                          <label>Mother's Name</label>
                          <input type="text" placeholder="Priya Sharma" id="m" name="mother_name" class="form-control">
                          </div>
                           <div class="col-lg-4" id="panel">
                          <label>Gender</label><br/>
                          <label class="radio-inline">
                          <input type="radio" value="male" name="gender" checked>Male
                          </label><br/>
                          <label class="radio-inline">
                          <input type="radio" value="Female" name="gender" >Female
                          </label><br/>
                          <label class="radio-inline">
                          <input type="radio" name="gender" value="other">Others
                          </label>
                           </div>
                         </div>
                           <label>Category</label>
                          <label class="radio-inline">
                          <input type="radio" value="gen" name="category" checked>General
                          </label>
                          <label class="radio-inline">
                          <input type="radio" value="obc" name="category">SC/ST
                          </label>
                          <label class="radio-inline">
                          <input type="radio" value="obc" name="category">OBC
                          </label><br/><br/>
                          <label>Address</label>
                          <input type="text" placeholder="Raniganj Chauraha" id="ad" name="address" class="form-control">
                          <div class="col-lg-4" style="margin-left:-10px;">
                          <label>City</label>
                          <input type="text" placeholder="Haldwani" id="c" name="city" class="form-control">
                          </div>
                          <div class="col-lg-4">
                          <label>PIN Code</label>
                          <input type="number" placeholder="123474" id="pi" name="pin" class="form-control">
                         </div>
                           <div class="col-lg-4">
                          <label>Add Student Picture</label>
                          <input type="file" id="pic" name="photo" class="form-control">
                         </div>
                    </div>
          
              <div class="col-lg-offset-2 col-lg-11 div1">
                <span>EDUCATIONAL DETAILS
                 <span class="glyphicon glyphicon-plus" style="float:right; color:#FFF;" id="flip1"></span>
                </div>
              <div id="panel1" class="col-lg-11" style="display:none;"><br>
                       <label>Admission Date</label>
                          <input type="date" placeholder="09-08-1995" id="a" name="adate" class="form-control">
                          <label>Roll No.</label>
                          <input type="number" placeholder="140030101001" id="r" name="roll" class="form-control">
                          <label>Enrollment No.</label>
                          <input type="number" placeholder="123000008765" id="en" name="eroll" class="form-control">
                          <label>EmailID</label>
                          <input type="email" placeholder="abc@gmail.com" id="e" name="email" class="form-control">
                           <label>Branch</label>
                           <label class="radio-inline">
                          <input type="radio" value="CSE" name="branch" checked>CSE
                          </label>
                          <label class="radio-inline">
                          <input type="radio" value="IT" name="branch">IT
                          </label>
                          <label class="radio-inline">
                          <input type="radio" value="ME" name="branch">ME
                          </label>
                           <label class="radio-inline">
                          <input type="radio" value="ECE" name="branch">ECE
                          </label>
                           <label class="radio-inline">
                          <input type="radio" value="EEE" name="branch">EEE
                          </label>
                          <br/><br/>
                          <label>Session</label>
                          <input type="text" placeholder="1997-2001" id="se" name="session" class="form-control">
                          <label>High School Percentage</label>
                          <input type="number" placeholder="60" name="high" class="form-control">
                          <label>Intermediate Percentage</label>
                          <input type="number" placeholder="60" name="inter" class="form-control">
                       
                          
              </div>
              <div class="col-lg-offset-2 col-lg-11 div1">
               <span>ACCOUNT DETAILS <span class="glyphicon glyphicon-plus" style="float:right; color:#FFF;" id="flip2"></span>
              </div>
              <div class="col-lg-11" id="panel2" style="display:none;"><br>
                   <label>UserName</label>
                   <input type="text" placeholder="abc123" id="u" name="uname" class="form-control">
                   <label>Password</label>
                   <input type="password" id="p" name="pass" class="form-control">
                   <button type="submit" class="btn bg-success">Submit</button>
              </div>
            </form> 
            </div>  
          </div>
          

           </div>
              </div>
        <!--<footer>
           <div class="container-fluid">
             <div class="row">
              <div class="col-lg-12">
                <div class="footer">
                  Copyrights � 2017 AITS . All rights reserved | Design by CSE
                  <a href="#home"><img src="Images/top_mover.png" style="float:right"/></a>
                </div>
              </div>
            </div>
           </div>
       </footer> -->
           
             
           <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
             <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
       </body>
</html>
