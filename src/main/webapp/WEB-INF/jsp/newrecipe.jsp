<!DOCTYPE html>
<div class="col-lg-12">
    <fieldset>
        <form action="show" method="POST" class="form-horizontal" enctype="multipart/form-data">
            <legend>Enter your Recipe</legend>
            <div class="form-group">
                <label class="col-lg-4">Title</label>

                <div class="col-lg-8">
                    <input type="text" name="title" rows="3" class="form-control"></textarea>
                </div>
            </div>

            <div class="form-group">
                <label class="col-lg-4">Poster</label>

                <div class="col-lg-8">
                    <input type="text" name="poster" class="form-control">
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4">Short Description</label>

                <div class="col-lg-8">
                    <textarea type="text" name="shortdescrip" rows='3' class="form-control"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4">Ingredients</label>

                <div class="col-lg-8">
                    <textarea type="text" name="ingredients" rows='5' class="form-control"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4">Directions</label>

                <div class="col-lg-8">
                    <textarea type="text" name="directions" rows='6' class="form-control"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label class="col-lg-4">Image</label>

                <div class="col-lg-8">
                    <input type="file" name="image">
                </div>
            </div>
            <input name="content" type="hidden" value="addRecipe">

            <div class="col-lg-2 control-label">

                <button type="submit" class="btn btn-primary">Submit</button>
            </div>

</form>
</fieldset>
</div>