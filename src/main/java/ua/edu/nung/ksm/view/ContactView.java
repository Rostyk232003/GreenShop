package ua.edu.nung.ksm.view;

public class ContactView {
    public static String getContacts(){
        return  "<section class=\"mb-4 mx-5\">\n" +
                "\n" +
                "    <h2 class=\"h1-responsive font-weight-bold text-center my-4\">Contact us</h2>\n" +
                "    <p class=\"text-center w-responsive mx-auto mb-5\">Do you have any questions? Please do not hesitate to contact us directly. Our team will come back to you within\n" +
                "        a matter of hours to help you.</p>\n" +
                "\n" +
                "    <div class=\"row\">\n" +
                "\n" +
                "        <div class=\"col-md-9 mb-5\">\n" +
                "            <form name=\"contact-form\" action=\"contact-form\" method=\"POST\">\n" +
                "\n" +
                "                <div class=\"row\">\n" +
                "\n" +
                "                    <div class=\"col-md-6\">\n" +
                "                        <div class=\"md-form mb-3\">\n" +
                "                            <label for=\"name\" class=\"\">Your name</label>\n" +
                "                            <input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\">\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "\n" +
                "                    <div class=\"col-md-6\">\n" +
                "                        <div class=\"md-form mb-3\">\n" +
                "                            <label for=\"email\" class=\"\">Your email</label>\n" +
                "                            <input type=\"text\" id=\"email\" name=\"email\" class=\"form-control\">\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"row\">\n" +
                "                    <div class=\"col-md-12\">\n" +
                "                        <div class=\"md-form mb-3\">\n" +
                "                            <label for=\"subject\" class=\"\">Subject</label>\n" +
                "                            <input type=\"text\" id=\"subject\" name=\"subject\" class=\"form-control\">\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"row\">\n" +
                "\n" +
                "                    <div class=\"col-md-12\">\n" +
                "\n" +
                "                        <div class=\"md-form mb-3\">\n" +
                "                            <label for=\"message\">Your message</label>\n" +
                "                            <textarea type=\"text\" id=\"message\" name=\"message\" rows=\"2\" class=\"form-control md-textarea\"></textarea>\n" +
                "                        </div>\n" +
                "\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "\n" +
                "                <button type=\"submit\" class=\"btn btn-primary\">Send</button>\n" +
                "               <div class=\"status\"></div>\n" +
                "               </div>\n" +
                "            </form>\n" +
                "\n" +
                "        <div class=\"col-md-3 text-center\">\n" +
                "            <ul class=\"list-unstyled\">\n" +
                "                <li><i class=\"bi bi-geo-alt-fill fa-2x\"></i>\n" +
                "                    <p>Ivano-Frankivsk, st.I.Franka, 12, Ukraine</p>\n" +
                "                </li>\n" +
                "\n" +
                "                <li><i class=\"bi bi-telephone-fill mt-4 fa-2x\"></i>\n" +
                "                    <p>+ 38 068 199 01 53</p>\n" +
                "                </li>\n" +
                "\n" +
                "                <li><i class=\"bi bi-envelope-fill mt-4 fa-2x\"></i>\n" +
                "                    <p>contact@gmail.com</p>\n" +
                "                </li>\n" +
                "            </ul>\n" +
                "        </div>\n" +
                "\n" +
                "    </div>\n" +
                "\n" +
                "</section>\n";
    }
}