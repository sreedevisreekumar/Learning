﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using OnlineShoppingStore.Domain.Entities;

namespace OnlineShoppingStore.WebUI.Models
{
    public class ProductsListViewModel
    {
        public IEnumerable<Product> Products { get; set; }
        public PagingInfo PagingInfo { get; set; }    
    }
}