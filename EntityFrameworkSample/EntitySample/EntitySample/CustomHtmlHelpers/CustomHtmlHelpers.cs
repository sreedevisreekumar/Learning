using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace EntitySample.CustomHtmlHelpers
{
    public static class CustomHtmlHelpers
    {
        public static IHtmlString Image(this HtmlHelper helper,string src,string alt)
        {
            TagBuilder tb = new TagBuilder("img");
            if (string.IsNullOrEmpty(src))
            {
                src = "";
                tb.Attributes.Add("src", src);
                
            }
            else
            {
                tb.Attributes.Add("src", VirtualPathUtility.ToAbsolute(src));
            }
            
            tb.Attributes.Add("alt", alt);
            return new MvcHtmlString(tb.ToString(TagRenderMode.SelfClosing));
        }
    }
}