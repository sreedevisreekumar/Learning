﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using OnlineShoppingStore.Domain.Abstract;
using OnlineShoppingStore.Domain.Entities;
using OnlineShoppingStore.WebUI.Models;
namespace OnlineShoppingStore.WebUI.Controllers
{
    public class ProductController : Controller
    {
        private readonly IProductRepository repository;
        public int PageSize = 4;
        public ProductController(IProductRepository repo)
        {
            repository = repo;
        }
        // GET: Product
        public ViewResult List(int page = 1)
        {
            ProductsListViewModel model = new ProductsListViewModel
            {
                Products = repository.Products
                  .OrderBy(p => p.ProductId)
                  .Skip((page - 1) * PageSize)
                  .Take(PageSize),
                PagingInfo = new PagingInfo
              {
                  CurrentPage = page,
                  ItemsPerPage = PageSize,
                  TotalItems = repository.Products.Count()
              }
            };
            return View(model);
        }
    }
}