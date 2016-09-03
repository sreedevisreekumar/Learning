using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.ComponentModel.DataAnnotations;
namespace EntitySample.Models
{
    [MetadataType(typeof(BooksMetadata))]
    public partial class Books
    {

    }
    public class BooksMetadata
    {
        //[ScaffoldColumn(false)]
        //public string ImageUrl { get; set; }

        //[ScaffoldColumn(false)]
        //public int book_id { get; set; }

        //[ScaffoldColumn(false)]
        //public Nullable<System.Guid> GUID { get; set; }

        [DisplayFormat(DataFormatString = "{0:C0}")]
        public Nullable<float> price { get; set; }

        [Display(Name="Book Title")]
        public string title { get; set; }

        [DisplayFormat(DataFormatString="{0:dd/MM/yyyy hh:mm:ss tt}")]
        public DateTime? SYS_TS { get; set; }
    }
}