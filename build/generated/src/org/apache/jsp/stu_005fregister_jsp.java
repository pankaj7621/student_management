package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class stu_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"Bootstrap/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"Logstu.css\" type=\"text/css\">\n");
      out.write("         <script src=\"Bootstrap/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("         <!--<script src=\"Bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>-->\n");
      out.write("         <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script> \n");
      out.write("         <script>\n");
      out.write("     $(document).ready(function(){\n");
      out.write("     $(\"#flip\").click(function(){\n");
      out.write("\t $(\"#flip\").toggleClass(\"glyphicon-minus glyphicon-plus\");\n");
      out.write("     $(\"#panel1\").slideUp(\"slow\");\n");
      out.write("     $(\"#panel2\").slideUp(\"slow\");\n");
      out.write("     $(\"#panel\").slideToggle(\"slow\");\n");
      out.write("\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("  \n");
      out.write("   $(document).ready(function(){\n");
      out.write("    $(\"#flip1\").click(function(){\n");
      out.write("\t\t $(\"#flip1\").toggleClass(\"glyphicon-minus glyphicon-plus\");\n");
      out.write("\t\t$(\"#panel\").slideUp(\"slow\");\n");
      out.write("        $(\"#panel2\").slideUp(\"slow\");\n");
      out.write("        $(\"#panel1\").slideToggle(\"slow\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("   $(document).ready(function(){\n");
      out.write("    $(\"#flip2\").click(function(){\n");
      out.write("\t\t$(\"#flip2\").toggleClass(\"glyphicon-minus glyphicon-plus\");\n");
      out.write("\t\t$(\"#panel\").slideUp(\"slow\");\n");
      out.write("        $(\"#panel1\").slideUp(\"slow\");\n");
      out.write("        $(\"#panel2\").slideToggle(\"slow\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("     /* $(document).ready(function(){\n");
      out.write("\t   $(\"#flip1\").click(function(){\n");
      out.write("   if($(\"#flip\").is(\":hidden\"))\n");
      out.write("{}\n");
      out.write("   else\n");
      out.write("     $(\"#flip\").toggleClass(\"glyphicon-minus glyphicon-plus\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("        /* $(document).ready(function(){\n");
      out.write("\t   $(\"#flip2\").click(function(){\n");
      out.write("   if($(\"#flip\").is(\":hidden\"))\n");
      out.write("{}\n");
      out.write("   else\n");
      out.write("     $(\"#flip\").toggleClass(\"glyphicon-minus glyphicon-plus\");\n");
      out.write("    });\n");
      out.write("});*/\n");
      out.write("\n");
      out.write("         </script>\n");
      out.write("         <title>Student Information Form</title>\n");
      out.write("  </head>\n");
      out.write("       <body>\n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                 <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"head\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("     <img src=\"Images/images.jpg\" class=\"img-responsive img-circle\" style=\"height:85px; width:90px; margin-top:-15px;\"/>\n");
      out.write("     </div>\n");
      out.write("                      <span style=\"text-shadow:3px 2px #C60; font-size:24px; margin-left:-350px;\">Amrapali Institute of Technology and Sciences</span>\n");
      out.write("                       <a href=\"Home.html\" style=\"margin-left:1220px; margin-top:20px; font-size:15px; color:#309; font-weight:bold;\">Logout</a>                 \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("          \n");
      out.write("           <div class=\"container-fluid\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-2\">\n");
      out.write("                    <div class=\"head1\">\n");
      out.write("                       <a href=\"teach_log.html\"><button>Home</button></a><br/>\n");
      out.write("                       <a href=\"teach_stu_log.html\"><button>Register Student</button></a></br>\n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <button class=\"dropdown-toggle\" data-toggle=\"dropdown\">View Students<span class=\"caret\"></span></button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"name_ret.html\">Name</a></li>\n");
      out.write("                                <li><a href=\"session_ret.html\">Session</a></li>\n");
      out.write("                                <li><a href=\"branch_ret.html\">Branch</a></li>\n");
      out.write("                                <li><a href=\"roll_ret.html\">Roll No.</a></li>\n");
      out.write("                                <li><a href=\"marks_ret.html\">Marks</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("        <!-- Form -->            \n");
      out.write("         <div class=\"col-lg-7 col-md-7 col-sm-7 col-xs-7 head2\">\n");
      out.write("          <span class=\"glyphicon glyphicon-plus-sign\"><span style=\"font-size:26px;\">REGISTER</span>\n");
      out.write("               <div class=\"col-lg-offset-4 col-lg-11 div1\">\n");
      out.write("                     PERSONAL DETAILS <span style=\"float:right; color:#FFF;\" class=\"glyphicon glyphicon-plus\" id=\"flip\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"panel\" class=\"col-lg-11\" style=\"display:none;\">\n");
      out.write("               <form method=\"post\" action=\"upload\" enctype=\"multipart/form-data\" id=\"panel\">\n");
      out.write("                 <div class=\"form-group row\" style=\"margin-top:15px;\" id=\"panel\">\n");
      out.write("                   <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                     <label>First Name </label>\n");
      out.write("                       <input type=\"text\" placeholder=\"Pankaj\" id=\"f\" name=\"fname\" class=\"form-control\">\n");
      out.write("             </div>\n");
      out.write("                          <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                          <label>Middle Name </label> \n");
      out.write("                          <input type=\"text\" placeholder=\"Kumar\" id=\"m\" name=\"mname\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                          <label>Last Name </label>\n");
      out.write("                          <input type=\"text\" placeholder=\"Kumar\" id=\"l\" name=\"lname\" class=\"form-control\">\n");
      out.write("                           </div>\n");
      out.write("                          <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                          <label>Date of Birth</label>\n");
      out.write("                          <input type=\"date\" placeholder=\"04-08-1995\" id=\"d\" name=\"dob\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                           <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                           <label>Father's Name</label>\n");
      out.write("                          <input type=\"text\" placeholder=\"Dinesh Sharma\" id=\"f\" name=\"father_name\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                           <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                          <label>Father's Phone No.</label>\n");
      out.write("                          <input type=\"number\" placeholder=\"9783277265\" id=\"fp\" name=\"fno\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                           <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                          <label>Student Phone No.</label>\n");
      out.write("                          <input type=\"number\" placeholder=\"9783277265\" id=\"ph\" name=\"sno\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                          \n");
      out.write("                           <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                          <label>Mother's Name</label>\n");
      out.write("                          <input type=\"text\" placeholder=\"Priya Sharma\" id=\"m\" name=\"mother_name\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                           <div class=\"col-lg-4\" id=\"panel\">\n");
      out.write("                          <label>Gender</label><br/>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"male\" name=\"gender\" checked>Male\n");
      out.write("                          </label><br/>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"Female\" name=\"gender\" >Female\n");
      out.write("                          </label><br/>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" name=\"gender\" value=\"other\">Others\n");
      out.write("                          </label>\n");
      out.write("                           </div>\n");
      out.write("                         </div>\n");
      out.write("                           <label>Category</label>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"gen\" name=\"category\" checked>General\n");
      out.write("                          </label>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"obc\" name=\"category\">SC/ST\n");
      out.write("                          </label>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"obc\" name=\"category\">OBC\n");
      out.write("                          </label><br/><br/>\n");
      out.write("                          <label>Address</label>\n");
      out.write("                          <input type=\"text\" placeholder=\"Raniganj Chauraha\" id=\"ad\" name=\"address\" class=\"form-control\">\n");
      out.write("                          <div class=\"col-lg-4\" style=\"margin-left:-10px;\">\n");
      out.write("                          <label>City</label>\n");
      out.write("                          <input type=\"text\" placeholder=\"Haldwani\" id=\"c\" name=\"city\" class=\"form-control\">\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"col-lg-4\">\n");
      out.write("                          <label>PIN Code</label>\n");
      out.write("                          <input type=\"number\" placeholder=\"123474\" id=\"pi\" name=\"pin\" class=\"form-control\">\n");
      out.write("                         </div>\n");
      out.write("                           <div class=\"col-lg-4\">\n");
      out.write("                          <label>Add Student Picture</label>\n");
      out.write("                          <input type=\"file\" id=\"pic\" name=\"photo\" class=\"form-control\">\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("          \n");
      out.write("              <div class=\"col-lg-offset-2 col-lg-11 div1\">\n");
      out.write("                <span>EDUCATIONAL DETAILS\n");
      out.write("                 <span class=\"glyphicon glyphicon-plus\" style=\"float:right; color:#FFF;\" id=\"flip1\"></span>\n");
      out.write("                </div>\n");
      out.write("              <div id=\"panel1\" class=\"col-lg-11\" style=\"display:none;\"><br>\n");
      out.write("                       <label>Admission Date</label>\n");
      out.write("                          <input type=\"date\" placeholder=\"09-08-1995\" id=\"a\" name=\"adate\" class=\"form-control\">\n");
      out.write("                          <label>Roll No.</label>\n");
      out.write("                          <input type=\"number\" placeholder=\"140030101001\" id=\"r\" name=\"roll\" class=\"form-control\">\n");
      out.write("                          <label>Enrollment No.</label>\n");
      out.write("                          <input type=\"number\" placeholder=\"123000008765\" id=\"en\" name=\"eroll\" class=\"form-control\">\n");
      out.write("                          <label>EmailID</label>\n");
      out.write("                          <input type=\"email\" placeholder=\"abc@gmail.com\" id=\"e\" name=\"email\" class=\"form-control\">\n");
      out.write("                           <label>Branch</label>\n");
      out.write("                           <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"CSE\" name=\"branch\" checked>CSE\n");
      out.write("                          </label>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"IT\" name=\"branch\">IT\n");
      out.write("                          </label>\n");
      out.write("                          <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"ME\" name=\"branch\">ME\n");
      out.write("                          </label>\n");
      out.write("                           <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"ECE\" name=\"branch\">ECE\n");
      out.write("                          </label>\n");
      out.write("                           <label class=\"radio-inline\">\n");
      out.write("                          <input type=\"radio\" value=\"EEE\" name=\"branch\">EEE\n");
      out.write("                          </label>\n");
      out.write("                          <br/><br/>\n");
      out.write("                          <label>Session</label>\n");
      out.write("                          <input type=\"text\" placeholder=\"1997-2001\" id=\"se\" name=\"session\" class=\"form-control\">\n");
      out.write("                          <label>High School Percentage</label>\n");
      out.write("                          <input type=\"number\" placeholder=\"60\" name=\"high\" class=\"form-control\">\n");
      out.write("                          <label>Intermediate Percentage</label>\n");
      out.write("                          <input type=\"number\" placeholder=\"60\" name=\"inter\" class=\"form-control\">\n");
      out.write("                       \n");
      out.write("                          \n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-offset-2 col-lg-11 div1\">\n");
      out.write("               <span>ACCOUNT DETAILS <span class=\"glyphicon glyphicon-plus\" style=\"float:right; color:#FFF;\" id=\"flip2\"></span>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-11\" id=\"panel2\" style=\"display:none;\"><br>\n");
      out.write("                   <label>UserName</label>\n");
      out.write("                   <input type=\"text\" placeholder=\"abc123\" id=\"u\" name=\"uname\" class=\"form-control\">\n");
      out.write("                   <label>Password</label>\n");
      out.write("                   <input type=\"password\" id=\"p\" name=\"pass\" class=\"form-control\">\n");
      out.write("                   <button type=\"submit\" class=\"btn bg-success\">Submit</button>\n");
      out.write("              </div>\n");
      out.write("            </form> \n");
      out.write("            </div>  \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("              </div>\n");
      out.write("        <!--<footer>\n");
      out.write("           <div class=\"container-fluid\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                  Copyrights © 2017 AITS . All rights reserved | Design by CSE\n");
      out.write("                  <a href=\"#home\"><img src=\"Images/top_mover.png\" style=\"float:right\"/></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("           </div>\n");
      out.write("       </footer> -->\n");
      out.write("           \n");
      out.write("             \n");
      out.write("           <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("             <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("       </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}