
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Employee],List[models.Project],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.Employee], projects: List[models.Project], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.119*/("""

"""),_display_(/*3.2*/main("employees",user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<p class="lead">Employee Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Projects</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All projects</a>
      """),_display_(/*12.8*/for(p <- projects) yield /*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(p.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/p/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/p/*14.33*/.getEmployees.size()),format.raw/*14.53*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th></th>
          <th>ID</th>
          <th>Surname</th>
          <th>Forename</th>
          <th>Department</th>
          <th>Address</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*39.10*/for(p<-employees) yield /*39.27*/ {_display_(Seq[Any](format.raw/*39.29*/("""
          """),format.raw/*40.11*/("""<tr>
              """),_display_(/*41.16*/if(env.resource("public/images/employeeImages/thumbnails/" + p.getId + ".jpg").isDefined)/*41.105*/ {_display_(Seq[Any](format.raw/*41.107*/("""
                """),format.raw/*42.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/"""),_display_(/*42.73*/(p.getId + ".jpg")),format.raw/*42.91*/(""""/></td>
            """)))}/*43.15*/else/*43.20*/{_display_(Seq[Any](format.raw/*43.21*/("""
                """),format.raw/*44.17*/("""<td><img src="/assets/images/employeeImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*45.14*/("""
            """),format.raw/*46.13*/("""<td class="numeric">"""),_display_(/*46.34*/p/*46.35*/.getId),format.raw/*46.41*/("""</td>
            <td>"""),_display_(/*47.18*/p/*47.19*/.getLname),format.raw/*47.28*/("""</td>
               <td>"""),_display_(/*48.21*/p/*48.22*/.getFname),format.raw/*48.31*/("""</td>
                  
            <td>"""),_display_(/*50.18*/p/*50.19*/.getDepartment.getName),format.raw/*50.41*/("""</td>
            <td>"""),_display_(/*51.18*/p/*51.19*/.getAddress.getAddress),format.raw/*51.41*/("""</td>
            <td>
              <a href=""""),_display_(/*53.25*/routes/*53.31*/.HomeController.updateEmployee(p.getId)),format.raw/*53.70*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*57.25*/routes/*57.31*/.HomeController.deleteEmployee(p.getId)),format.raw/*57.70*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*62.10*/("""
      """),format.raw/*63.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*68.17*/routes/*68.23*/.HomeController.addEmployee()),format.raw/*68.52*/("""">
        <button class="btn btn-primary">Add an Employee</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*74.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.Employee],projects:List[models.Project],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,projects,user,env)

  def f:((List[models.Employee],List[models.Project],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,projects,user,env) => apply(employees,projects,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 08 13:01:45 GMT 2018
                  SOURCE: /home/wdd/webapps/GroupCA-master/app/views/index.scala.html
                  HASH: b524c13e0d22c9f69e197904f8806e4bd4573726
                  MATRIX: 1023->1|1236->118|1264->121|1294->143|1333->145|1361->147|1542->301|1557->307|1602->331|1678->381|1712->399|1752->401|1788->410|1825->420|1840->426|1891->456|1945->483|1955->484|1984->492|2023->503|2071->524|2081->525|2122->545|2180->573|2212->578|2356->696|2397->728|2437->730|2473->739|2545->784|2559->789|2595->804|2631->813|2675->827|2709->834|3002->1100|3035->1117|3075->1119|3114->1130|3161->1150|3260->1239|3301->1241|3346->1258|3429->1314|3468->1332|3509->1355|3522->1360|3561->1361|3606->1378|3725->1466|3766->1479|3814->1500|3824->1501|3851->1507|3901->1530|3911->1531|3941->1540|3994->1566|4004->1567|4034->1576|4103->1618|4113->1619|4156->1641|4206->1664|4216->1665|4259->1687|4333->1734|4348->1740|4408->1779|4605->1949|4620->1955|4680->1994|4900->2183|4934->2190|5009->2238|5024->2244|5074->2273|5209->2378
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|77->45|78->46|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|80->48|82->50|82->50|82->50|83->51|83->51|83->51|85->53|85->53|85->53|89->57|89->57|89->57|94->62|95->63|100->68|100->68|100->68|106->74
                  -- GENERATED --
              */
          