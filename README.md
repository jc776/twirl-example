Given a template:
```html
@import example.Item
@(items: Seq[Item])

<html>
  <body>
    <h1>Hello!</h1>
	<ul>
	  @for(item <- items) {
        <li>@item.name</li>
      }
	</ul>
  </body>
</html>
```

Example output:
```html
<html>
  <body>
    <h1>Hello!</h1>
        <ul>

        <li>Item 1</li>

        <li>Item 2</li>

        <li>Item 3</li>

        <li>Item 4</li>

        <li>Item 5</li>

        <li>Item 6</li>

        <li>Item 7</li>

        <li>Item 8</li>

        <li>Item 9</li>

        <li>Item 10</li>

        </ul>
  </body>
</html>
```